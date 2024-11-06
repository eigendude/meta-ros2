# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "Gazebo plugins for building infrastructure simulation"
AUTHOR = "Luca Della Vedova <luca@openrobotics.org>"
ROS_AUTHOR = "Luca Della Vedova"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "rmf_simulation"
ROS_BPN = "rmf_building_sim_gz_plugins"

ROS_BUILD_DEPENDS = " \
    gz-gui-vendor \
    gz-msgs-vendor \
    gz-plugin-vendor \
    gz-rendering-vendor \
    gz-sim-vendor \
    gz-transport-vendor \
    menge-vendor \
    qtbase \
    qtdeclarative \
    rclcpp \
    rmf-door-msgs \
    rmf-fleet-msgs \
    rmf-lift-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    gz-gui-vendor \
    gz-msgs-vendor \
    gz-plugin-vendor \
    gz-rendering-vendor \
    gz-sim-vendor \
    gz-transport-vendor \
    menge-vendor \
    qtbase \
    qtdeclarative \
    rclcpp \
    rmf-door-msgs \
    rmf-fleet-msgs \
    rmf-lift-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gz-gui-vendor \
    gz-msgs-vendor \
    gz-plugin-vendor \
    gz-rendering-vendor \
    gz-sim-vendor \
    gz-transport-vendor \
    menge-vendor \
    qtbase \
    qtdeclarative \
    rclcpp \
    rmf-door-msgs \
    rmf-fleet-msgs \
    rmf-lift-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rmf_simulation-release/archive/release/jazzy/rmf_building_sim_gz_plugins/2.3.2-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/rmf_building_sim_gz_plugins"
SRC_URI = "git://github.com/ros2-gbp/rmf_simulation-release;${ROS_BRANCH};protocol=https"
SRCREV = "b4f209d394558c80991e7e17cf0e04754d58c0db"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}