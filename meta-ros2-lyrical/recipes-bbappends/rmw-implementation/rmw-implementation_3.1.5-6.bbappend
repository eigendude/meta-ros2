# rmw-zenoh-cpp is skipped when meta-zenoh is absent.
# Do not leave rmw-implementation with a dangling dependency on it.
ROS_BUILD_DEPENDS:remove = "${@bb.utils.contains('BBFILE_COLLECTIONS', 'zenoh-layer', '', 'rmw-zenoh-cpp', d)}"
ROS_BUILDTOOL_DEPENDS:remove = "${@bb.utils.contains('BBFILE_COLLECTIONS', 'zenoh-layer', '', 'rmw-zenoh-cpp', d)}"
ROS_EXEC_DEPENDS:remove = "${@bb.utils.contains('BBFILE_COLLECTIONS', 'zenoh-layer', '', 'rmw-zenoh-cpp', d)}"
DEPENDS:remove = "${@bb.utils.contains('BBFILE_COLLECTIONS', 'zenoh-layer', '', 'rmw-zenoh-cpp', d)}"
RDEPENDS:${PN}:remove = "${@bb.utils.contains('BBFILE_COLLECTIONS', 'zenoh-layer', '', 'rmw-zenoh-cpp', d)}"
