# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Generate the type support for C messages."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rosidl_typesupport"
ROS_BPN = "rosidl_typesupport_c"

ROS_BUILD_DEPENDS = " \
    poco \
    poco-vendor \
    rosidl-generator-c \
    rosidl-typesupport-connext-c \
    rosidl-typesupport-introspection-c \
    rosidl-typesupport-opensplice-c \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    rmw-implementation \
    rosidl-generator-c \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-core-native \
"

ROS_EXEC_DEPENDS = " \
    poco \
    poco-vendor \
    rosidl-typesupport-interface \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport-release/archive/release/crystal/rosidl_typesupport_c/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "cd9479c0ecccddebd0060029f2fc92d1"
SRC_URI[sha256sum] = "be4fdfbf1648deced42c792279d1ed834eba3df058192d0e30c7600255c297e5"
S = "${WORKDIR}/rosidl_typesupport-release-release-crystal-rosidl_typesupport_c-0.6.3-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rosidl-typesupport', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rosidl-typesupport', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosidl-typesupport/rosidl-typesupport_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosidl-typesupport/rosidl-typesupport-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosidl-typesupport/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosidl-typesupport/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
